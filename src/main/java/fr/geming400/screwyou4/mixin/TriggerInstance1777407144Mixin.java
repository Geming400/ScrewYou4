package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.UsingItemTrigger.TriggerInstance.class)
public class TriggerInstance1777407144Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_868780876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(868780876L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1747136627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1747136627L))
            info.setReturnValue("\u9A75Y@]}iC(CHICf9x):35\u32DC8N\u4E84$w9a\uB7FE");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1960208061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1960208061L))
            info.setReturnValue(-334612054);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void matches__1148376911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1148376911L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "item()Ljava/util/Optional;", cancellable = true)
    private void item_978892905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(978892905L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lookingAt(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void lookingAt__1808360473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1808360473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_546754103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(546754103L))
            info.setReturnValue(null);
    }


}
