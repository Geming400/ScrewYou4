package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.FishingRodHookedTrigger.TriggerInstance.class)
public class TriggerInstance243070220Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__665556048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-665556048L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1013493745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1013493745L))
            info.setReturnValue("$}7S(n=J:jaApyJ\u95E5b$ydwUhJ(f-=\u79C5;TWF)\uC474\u7625=P\uAE43/^\uB618z\u47CC`\u6AF9tB@T=0_.ugL`|<`@vhcQ\uD43CQ0RRf \u8C1E");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_800422311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(800422311L))
            info.setReturnValue(-351912984);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;Ljava/util/Collection;)Z", cancellable = true)
    private void matches_1515496933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1515496933L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate_503243326(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(503243326L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "item()Ljava/util/Optional;", cancellable = true)
    private void item__555444019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-555444019L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player__987582821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-987582821L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rod()Ljava/util/Optional;", cancellable = true)
    private void rod_324074369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(324074369L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fishedItem(Ljava/util/Optional;Ljava/util/Optional;Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void fishedItem_1601526998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1601526998L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entity()Ljava/util/Optional;", cancellable = true)
    private void entity_332894621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(332894621L))
            info.setReturnValue(null);
    }


}
