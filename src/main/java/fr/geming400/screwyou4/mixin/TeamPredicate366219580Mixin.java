package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.TeamPredicate.class)
public class TeamPredicate366219580Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__542406688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-542406688L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1136643105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1136643105L))
            info.setReturnValue(" +&\u6A29}<\u8D00\uC674x[T-^(O\u23D0e(L?G1\uC6B1u\u24B9WwUm>M$V\uCC2E:n\uA8E0\u5804=ip(i}Z$7m[\u5796Xa<LU\"rwgkj}mmwd)Oz!H\u3E52mLdG!Eo[8I[uGKFGsU\u53F9\u678C?");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_923571671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(923571671L))
            info.setReturnValue(-366977026);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches_1716528514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1716528514L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "team()Ljava/lang/String;", cancellable = true)
    private void team__480002206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-480002206L))
            info.setReturnValue("j\u5300A:");
    }


}
