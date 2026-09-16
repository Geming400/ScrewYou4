package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.EntitySlotsPredicate.class)
public class EntitySlotsPredicate201913835Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__706712433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-706712433L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_972337360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(972337360L))
            info.setReturnValue("\u9E48M^*=0\u5E87B3jX|x!Gdhxb\u75A5I1|sVBJ8G \u7A89#Z\uCFF8\u2342\u9822kHh`Z[$\u19E5{y\u182E\uB459*A\u7B60oHB\u26ECQNZ[eO}F*,K_\u968CUxoLf@");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_759265926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(759265926L))
            info.setReturnValue(-1595064998);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches_1552222769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1552222769L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "slots()Lnet/minecraft/advancements/predicates/SlotsPredicate;", cancellable = true)
    private void slots__1437117023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1437117023L))
            info.setReturnValue(null);
    }


}
