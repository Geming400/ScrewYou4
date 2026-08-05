package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.ticks.ProtoChunkTicks.class)
public class ProtoChunkTicks1116454051Mixin {
        @Inject(at = @At("HEAD"), method = "load(Ljava/util/List;)Lnet/minecraft/world/ticks/ProtoChunkTicks;", cancellable = true)
    private static void load__501379255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-501379255L))
            info.setReturnValue(new net.minecraft.world.ticks.ProtoChunkTicks());
    }

    @Inject(at = @At("HEAD"), method = "count()I", cancellable = true)
    private void count_1154716297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1154716297L))
            info.setReturnValue(-1262538803);
    }

    @Inject(at = @At("HEAD"), method = "schedule(Lnet/minecraft/world/ticks/ScheduledTick;)V", cancellable = true)
    private void schedule__1315091347(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1315091347L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pack(J)Ljava/util/List;", cancellable = true)
    private void pack_1591771033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1591771033L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasScheduledTick(Lnet/minecraft/core/BlockPos;Ljava/lang/Object;)Z", cancellable = true)
    private void hasScheduledTick__899559222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-899559222L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "scheduledTicks()Ljava/util/List;", cancellable = true)
    private void scheduledTicks__1552176429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1552176429L))
            info.setReturnValue(null);
    }


}
