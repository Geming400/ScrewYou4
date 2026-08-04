package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Relative.class)
public class Relative_359033624Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/Relative;", cancellable = true)
    private static void values_47173491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(47173491L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/Relative;", cancellable = true)
    private static void valueOf__1361171690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1361171690L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "position(ZZZ)Ljava/util/Set;", cancellable = true)
    private static void position__1254524037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1254524037L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "direction(ZZZ)Ljava/util/Set;", cancellable = true)
    private static void direction__1254524037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1254524037L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "union([Ljava/util/Set;)Ljava/util/Set;", cancellable = true)
    private static void union_1288276795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1288276795L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pack(Ljava/util/Set;)I", cancellable = true)
    private static void pack__185059350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-185059350L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(I)Ljava/util/Set;", cancellable = true)
    private static void unpack_1554097898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1554097898L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotation(ZZ)Ljava/util/Set;", cancellable = true)
    private static void rotation_980705137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(980705137L))
            info.setReturnValue(null);
    }


}
