package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.Climate.ParameterList.class)
public class ParameterList2035755234Mixin {
        @Inject(at = @At("HEAD"), method = "values()Ljava/util/List;", cancellable = true)
    private void values__632875246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-632875246L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findValue(Lnet/minecraft/world/level/biome/Climate$TargetPoint;)Ljava/lang/Object;", cancellable = true)
    private void findValue__1658155621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1658155621L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/MapCodec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_538845905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(538845905L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findValueBruteForce(Lnet/minecraft/world/level/biome/Climate$TargetPoint;)Ljava/lang/Object;", cancellable = true)
    private void findValueBruteForce__1658155621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1658155621L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "findValueIndex(Lnet/minecraft/world/level/biome/Climate$TargetPoint;)Ljava/lang/Object;", cancellable = true)
    private void findValueIndex__1658155621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1658155621L))
            info.setReturnValue(new java.lang.Object());
    }


}
