package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.Climate.ParameterList.class)
public class ParameterList2035755234Mixin {
        @Inject(at = @At("HEAD"), method = "values()Ljava/util/List;", cancellable = true)
    private void values__1081290956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1081290956L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findValue(Lnet/minecraft/world/level/biome/Climate$TargetPoint;)Ljava/lang/Object;", cancellable = true)
    private void findValue_44876643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(44876643L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/MapCodec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_1448123899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1448123899L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findValueIndex(Lnet/minecraft/world/level/biome/Climate$TargetPoint;)Ljava/lang/Object;", cancellable = true)
    private void findValueIndex__1914894111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1914894111L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "findValueBruteForce(Lnet/minecraft/world/level/biome/Climate$TargetPoint;)Ljava/lang/Object;", cancellable = true)
    private void findValueBruteForce_1128404206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1128404206L))
            info.setReturnValue(new java.lang.Object());
    }


}
