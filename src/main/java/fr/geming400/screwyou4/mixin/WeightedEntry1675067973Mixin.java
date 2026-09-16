package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.ShufflingList.WeightedEntry.class)
public class WeightedEntry1675067973Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1849476294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1849476294L))
            info.setReturnValue("YR%n*2oP:gzQt\uA363Z");
    }

    @Inject(at = @At("HEAD"), method = "getData()Ljava/lang/Object;", cancellable = true)
    private void getData_1317537792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1317537792L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_2026716786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2026716786L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWeight()I", cancellable = true)
    private void getWeight__1235015811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1235015811L))
            info.setReturnValue(-453576375);
    }


}
