package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.MobEffectsPredicate.class)
public class MobEffectsPredicate112390263Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__796236005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-796236005L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_882813788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(882813788L))
            info.setReturnValue("\u5A6BU/$dE+_t\uA930/$IO,u)\u40C2\u5C57S7@pF|V7d[Qa\uB9EF4!!sa");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_669742354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(669742354L))
            info.setReturnValue(-2124891783);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void matches_223058129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(223058129L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Ljava/util/Map;)Z", cancellable = true)
    private void matches__242577124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-242577124L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void matches__489663430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-489663430L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "effectMap()Ljava/util/Map;", cancellable = true)
    private void effectMap__240089228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-240089228L))
            info.setReturnValue(null);
    }


}
