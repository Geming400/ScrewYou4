package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.axolotl.Axolotl.AxolotlGroupData.class)
public class AxolotlGroupData1315767873Mixin {
        @Inject(at = @At("HEAD"), method = "getVariant(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/world/entity/animal/axolotl/Axolotl$Variant;", cancellable = true)
    private void getVariant__128957356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-128957356L))
            info.setReturnValue(net.minecraft.world.entity.animal.axolotl.Axolotl.Variant.WILD);
    }


}
