package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.entity.LevelEntityGetterAdapter.class)
public class LevelEntityGetterAdapter1120941813Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/level/entity/EntityTypeTest;Lnet/minecraft/world/phys/AABB;Lnet/minecraft/util/AbortableIterationConsumer;)V", cancellable = true)
    private void get_1133759616(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1133759616L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/level/entity/EntityTypeTest;Lnet/minecraft/util/AbortableIterationConsumer;)V", cancellable = true)
    private void get_1901557391(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1901557391L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/phys/AABB;Ljava/util/function/Consumer;)V", cancellable = true)
    private void get__1713390319(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1713390319L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "get(Ljava/util/UUID;)Lnet/minecraft/world/level/entity/EntityAccess;", cancellable = true)
    private void get_141674080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(141674080L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(I)Lnet/minecraft/world/level/entity/EntityAccess;", cancellable = true)
    private void get_822184881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(822184881L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAll()Ljava/lang/Iterable;", cancellable = true)
    private void getAll__1788856408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1788856408L))
            info.setReturnValue(null);
    }


}
