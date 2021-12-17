/*
 * Copyright (c) 2021 enjarai
 * Copyright (c) 2021 darkerbit
 * Copyright (c) 2021 wafflecoffee
 * Copyright (c) 2020 TeamMidnightDust (MidnightConfig only)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package nl.enjarai.mls.screens;

import net.minecraft.client.MinecraftClient;
import net.minecraft.util.Identifier;

public class SnowFlakesScreen extends LoadingScreen {

  public SnowFlakesScreen(MinecraftClient client) {
      super(client);
  }

  @Override
  public void createPatch(Identifier texture) {
      patches.add(new Patch(
              random.nextDouble() * this.client.getWindow().getScaledWidth() + getOffsetX(),
              -patchSize + getOffsetY(), 0,
              (random.nextDouble() - 0.5) * 0.6,
              random.nextDouble() * 3.0 + 1.0,
              (random.nextDouble() - 0.5) * 6.0,
              random.nextDouble() / 2 + 0.5,
              texture, patchSize
      ));
  }
}
