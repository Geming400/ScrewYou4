package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.EffectsChangedTrigger.TriggerInstance.class)
public class TriggerInstance1834669273Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1074785764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1074785764L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_699209298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(699209298L))
            info.setReturnValue("GFJIy|+4(M`4N\u798BkV\u392EhJg\u937B z$bNVV]_\u7B98'I\u205E,#a\u1C2F\uCA1DmtEl\u264CC\u16D5&:CH]\uA86B\u5728t\u2E1D3\u7A7D\uD2B5\uC569.9f");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1872932015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1872932015L))
            info.setReturnValue(587590828);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void matches__1263250497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1263250497L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate__305271455(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-305271455L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "source()Ljava/util/Optional;", cancellable = true)
    private void source_2080130695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2080130695L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_2080130695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2080130695L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "effects()Ljava/util/Optional;", cancellable = true)
    private void effects_2080130695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2080130695L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gotEffectsFrom(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void gotEffectsFrom_131684837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(131684837L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasEffects(Lnet/minecraft/advancements/predicates/MobEffectsPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void hasEffects_1431756726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1431756726L))
            info.setReturnValue(null);
    }


}
