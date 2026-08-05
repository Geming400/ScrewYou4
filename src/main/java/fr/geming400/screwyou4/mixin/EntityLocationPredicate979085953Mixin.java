package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.EntityLocationPredicate.class)
public class EntityLocationPredicate979085953Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1930369084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1930369084L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__156374022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-156374022L))
            info.setReturnValue("1HM\u408A+-\u6D48FEQBItq]S<\u5945syzQ>|3Od)4CS>O\u4141\u38A4zfv[ \u9A03Hi#u|4S\u6AC4{jtt\"uN\u5E6BKTi\u9113u\u1013y'\u3CFAH@`W\u97FE<+M]%");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1017348695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1017348695L))
            info.setReturnValue(-300491279);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__975105958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-975105958L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "predicate()Lnet/minecraft/advancements/predicates/LocationPredicate;", cancellable = true)
    private void predicate__97431186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-97431186L))
            info.setReturnValue(null);
    }


}
