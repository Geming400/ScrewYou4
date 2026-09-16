package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.EffectsChangedTrigger.TriggerInstance.class)
public class TriggerInstance1834669273Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_926043005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(926043005L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1689874498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1689874498L))
            info.setReturnValue("}0.&n#\u33FEP.2Uf,\"ww{L,\"CH6<p3Heo!{0\u307BTN-1o{W`'2Jf@\u5598\u4EC3\u4760x.<?[m@4\uA554\u7C83#S(W\u16BDUs\u281EA1:N^w|:93}SyC\u7F90J\u1641SjS[\u0B0C08");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1902945932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1902945932L))
            info.setReturnValue(-1646297548);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void matches__1237206990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1237206990L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate_2094842379(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2094842379L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "source()Ljava/util/Optional;", cancellable = true)
    private void source_653053346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(653053346L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_604016232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(604016232L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "effects()Ljava/util/Optional;", cancellable = true)
    private void effects__613262967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-613262967L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasEffects(Lnet/minecraft/advancements/predicates/MobEffectsPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void hasEffects__27146562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-27146562L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gotEffectsFrom(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void gotEffectsFrom__1708461499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1708461499L))
            info.setReturnValue(null);
    }


}
