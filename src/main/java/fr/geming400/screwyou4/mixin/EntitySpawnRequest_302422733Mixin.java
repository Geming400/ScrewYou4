package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.EntitySpawnRequest.class)
public class EntitySpawnRequest_302422733Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__606203536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-606203536L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1072846257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1072846257L))
            info.setReturnValue("C5a\u7453,Bef$Gkjd!rm1n?bqL+s3\uC497P>De[U5Vb;cO#\u3FE3\uA224NXy\u1F4BndXu) |\u3636/zc({\uCC99[1(2Dj>5\u3723\u4360Li\uD74F#Yc");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_859774823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(859774823L))
            info.setReturnValue(1256957376);
    }

    @Inject(at = @At("HEAD"), method = "reason()Lnet/minecraft/world/entity/EntitySpawnReason;", cancellable = true)
    private void reason__421504899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-421504899L))
            info.setReturnValue(net.minecraft.world.entity.EntitySpawnReason.STRUCTURE);
    }

    @Inject(at = @At("HEAD"), method = "ignoreChecks()Z", cancellable = true)
    private void ignoreChecks_2009674182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2009674182L))
            info.setReturnValue(false);
    }


}
