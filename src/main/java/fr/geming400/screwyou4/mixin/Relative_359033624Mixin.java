package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Relative.class)
public class Relative_359033624Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/Relative;", cancellable = true)
    private static void values__149822955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-149822955L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/Relative;", cancellable = true)
    private static void valueOf_608833262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(608833262L))
            info.setReturnValue(net.minecraft.world.entity.Relative.Y);
    }

    @Inject(at = @At("HEAD"), method = "position(ZZZ)Ljava/util/Set;", cancellable = true)
    private static void position__824909852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-824909852L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "direction(ZZZ)Ljava/util/Set;", cancellable = true)
    private static void direction__307934790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-307934790L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "union([Ljava/util/Set;)Ljava/util/Set;", cancellable = true)
    private static void union__541849076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-541849076L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pack(Ljava/util/Set;)I", cancellable = true)
    private static void pack__1676176509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1676176509L))
            info.setReturnValue(-161816775);
    }

    @Inject(at = @At("HEAD"), method = "unpack(I)Ljava/util/Set;", cancellable = true)
    private static void unpack__1462430180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1462430180L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotation(ZZ)Ljava/util/Set;", cancellable = true)
    private static void rotation__230913357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-230913357L))
            info.setReturnValue(null);
    }


}
