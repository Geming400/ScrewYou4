package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.entity.EntitySection.class)
public class EntitySection_1591256908Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/world/level/entity/EntityAccess;)Z", cancellable = true)
    private void remove_1859347526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1859347526L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_2034988496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2034988496L))
            info.setReturnValue(-600401099);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty__1644594017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1644594017L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/world/level/entity/EntityAccess;)V", cancellable = true)
    private void add__1343229729(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1343229729L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStatus()Lnet/minecraft/world/level/entity/Visibility;", cancellable = true)
    private void getStatus_1274995717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1274995717L))
            info.setReturnValue(net.minecraft.world.level.entity.Visibility.TRACKED);
    }

    @Inject(at = @At("HEAD"), method = "getEntities(Lnet/minecraft/world/phys/AABB;Lnet/minecraft/util/AbortableIterationConsumer;)Lnet/minecraft/util/AbortableIterationConsumer$Continuation;", cancellable = true)
    private void getEntities_1972789261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1972789261L))
            info.setReturnValue(net.minecraft.util.AbortableIterationConsumer.Continuation.CONTINUE);
    }

    @Inject(at = @At("HEAD"), method = "getEntities()Ljava/util/stream/Stream;", cancellable = true)
    private void getEntities_549323241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(549323241L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntities(Lnet/minecraft/world/level/entity/EntityTypeTest;Lnet/minecraft/world/phys/AABB;Lnet/minecraft/util/AbortableIterationConsumer;)Lnet/minecraft/util/AbortableIterationConsumer$Continuation;", cancellable = true)
    private void getEntities__357476857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-357476857L))
            info.setReturnValue(net.minecraft.util.AbortableIterationConsumer.Continuation.ABORT);
    }

    @Inject(at = @At("HEAD"), method = "updateChunkStatus(Lnet/minecraft/world/level/entity/Visibility;)Lnet/minecraft/world/level/entity/Visibility;", cancellable = true)
    private void updateChunkStatus__533268264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-533268264L))
            info.setReturnValue(net.minecraft.world.level.entity.Visibility.TICKING);
    }


}
