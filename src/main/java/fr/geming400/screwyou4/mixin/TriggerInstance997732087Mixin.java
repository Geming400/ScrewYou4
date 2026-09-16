package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.BredAnimalsTrigger.TriggerInstance.class)
public class TriggerInstance997732087Mixin {
        @Inject(at = @At("HEAD"), method = "parent()Ljava/util/Optional;", cancellable = true)
    private void parent__935343281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-935343281L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_89105819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(89105819L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1768155612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1768155612L))
            info.setReturnValue("\u6ED22$@:qy");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1555084178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1555084178L))
            info.setReturnValue(-124404513);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/storage/loot/LootContext;Lnet/minecraft/world/level/storage/loot/LootContext;Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void matches__431464456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-431464456L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate_1257905193(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1257905193L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "child()Ljava/util/Optional;", cancellable = true)
    private void child_95879617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(95879617L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "partner()Ljava/util/Optional;", cancellable = true)
    private void partner_1857987949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1857987949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bredAnimals(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void bredAnimals_745800443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(745800443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bredAnimals(Ljava/util/Optional;Ljava/util/Optional;Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void bredAnimals__662153821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-662153821L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bredAnimals()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void bredAnimals_1302970198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1302970198L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player__232920954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-232920954L))
            info.setReturnValue(null);
    }


}
