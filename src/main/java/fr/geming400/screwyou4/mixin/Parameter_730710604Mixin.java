package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.Climate.Parameter.class)
public class Parameter_730710604Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2116222862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2116222862L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__404749868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-404749868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_768973345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(768973345L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "min()J", cancellable = true)
    private void min_768973810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(768973810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "max()J", cancellable = true)
    private void max_768973810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(768973810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "distance(J)J", cancellable = true)
    private void distance_1945539564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1945539564L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "distance(Lnet/minecraft/world/level/biome/Climate$Parameter;)J", cancellable = true)
    private void distance_378025386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(378025386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "span(FF)Lnet/minecraft/world/level/biome/Climate$Parameter;", cancellable = true)
    private static void span_406017320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(406017320L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "span(Lnet/minecraft/world/level/biome/Climate$Parameter;Lnet/minecraft/world/level/biome/Climate$Parameter;)Lnet/minecraft/world/level/biome/Climate$Parameter;", cancellable = true)
    private static void span_728259432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(728259432L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "span(Lnet/minecraft/world/level/biome/Climate$Parameter;)Lnet/minecraft/world/level/biome/Climate$Parameter;", cancellable = true)
    private void span_1431109928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1431109928L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "point(F)Lnet/minecraft/world/level/biome/Climate$Parameter;", cancellable = true)
    private static void point_347354846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(347354846L))
            info.setReturnValue(null);
    }


}
