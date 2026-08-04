package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.entity.EntityLookup.class)
public class EntityLookup1600025653Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/world/level/entity/EntityAccess;)V", cancellable = true)
    private void remove__1445551192(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1445551192L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/world/level/entity/EntityAccess;)V", cancellable = true)
    private void add__1445551192(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1445551192L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "count()I", cancellable = true)
    private void count_1638287899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1638287899L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntities(Lnet/minecraft/world/level/entity/EntityTypeTest;Lnet/minecraft/util/AbortableIterationConsumer;)V", cancellable = true)
    private void getEntities__2093902491(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2093902491L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntity(Ljava/util/UUID;)Lnet/minecraft/world/level/entity/EntityAccess;", cancellable = true)
    private void getEntity_733293238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(733293238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntity(I)Lnet/minecraft/world/level/entity/EntityAccess;", cancellable = true)
    private void getEntity_1630541979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1630541979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAllEntities()Ljava/lang/Iterable;", cancellable = true)
    private void getAllEntities__409724035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-409724035L))
            info.setReturnValue(null);
    }


}
