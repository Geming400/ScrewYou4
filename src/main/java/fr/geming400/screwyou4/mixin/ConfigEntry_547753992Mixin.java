package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.validation.PathAllowList.ConfigEntry.class)
public class ConfigEntry_547753992Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/validation/PathAllowList$EntryType;", cancellable = true)
    private void type__514382561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-514382561L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__360872277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-360872277L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1318177516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1318177516L))
            info.setReturnValue("#Q\uBA67OX,;>k\uC1633\u581DGx(8Got\u227133K0@]aMOX[E%\uA034\u9DCD\uA19B6banzK");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1105106082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1105106082L))
            info.setReturnValue(-326942676);
    }

    @Inject(at = @At("HEAD"), method = "compile(Ljava/nio/file/FileSystem;)Ljava/nio/file/PathMatcher;", cancellable = true)
    private void compile_784380879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(784380879L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pattern()Ljava/lang/String;", cancellable = true)
    private void pattern_1063595808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1063595808L))
            info.setReturnValue("");
    }

    @Inject(at = @At("HEAD"), method = "parse(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private static void parse_583848278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(583848278L))
            info.setReturnValue(null);
    }


}
