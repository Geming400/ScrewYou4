package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.Advancement.Builder.class)
public class Builder2115312049Mixin {
        @Inject(at = @At("HEAD"), method = "parent(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/advancements/Advancement$Builder;", cancellable = true)
    private void parent_623466696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(623466696L))
            info.setReturnValue(new net.minecraft.advancements.Advancement$Builder());
    }

    @Inject(at = @At("HEAD"), method = "parent(Lnet/minecraft/advancements/AdvancementHolder;)Lnet/minecraft/advancements/Advancement$Builder;", cancellable = true)
    private void parent__606802331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-606802331L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "save(Ljava/util/function/Consumer;Ljava/lang/String;)Lnet/minecraft/advancements/AdvancementHolder;", cancellable = true)
    private void save__1994641465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1994641465L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "display(Lnet/minecraft/advancements/DisplayInfo;)Lnet/minecraft/advancements/Advancement$Builder;", cancellable = true)
    private void display__89457847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-89457847L))
            info.setReturnValue(new net.minecraft.advancements.Advancement$Builder());
    }

    @Inject(at = @At("HEAD"), method = "display(Lnet/minecraft/world/item/ItemStackTemplate;Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/Component;Lnet/minecraft/resources/Identifier;Lnet/minecraft/advancements/AdvancementType;ZZZ)Lnet/minecraft/advancements/Advancement$Builder;", cancellable = true)
    private void display_805006846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(805006846L))
            info.setReturnValue(new net.minecraft.advancements.Advancement$Builder());
    }

    @Inject(at = @At("HEAD"), method = "display(Lnet/minecraft/world/level/ItemLike;Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/Component;Lnet/minecraft/resources/Identifier;Lnet/minecraft/advancements/AdvancementType;ZZZ)Lnet/minecraft/advancements/Advancement$Builder;", cancellable = true)
    private void display_961467612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(961467612L))
            info.setReturnValue(new net.minecraft.advancements.Advancement$Builder());
    }

    @Inject(at = @At("HEAD"), method = "build(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/advancements/AdvancementHolder;", cancellable = true)
    private void build__539728141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-539728141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rewards(Lnet/minecraft/advancements/AdvancementRewards;)Lnet/minecraft/advancements/Advancement$Builder;", cancellable = true)
    private void rewards_919531685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(919531685L))
            info.setReturnValue(new net.minecraft.advancements.Advancement$Builder());
    }

    @Inject(at = @At("HEAD"), method = "rewards(Lnet/minecraft/advancements/AdvancementRewards$Builder;)Lnet/minecraft/advancements/Advancement$Builder;", cancellable = true)
    private void rewards__628354564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-628354564L))
            info.setReturnValue(new net.minecraft.advancements.Advancement$Builder());
    }

    @Inject(at = @At("HEAD"), method = "advancement()Lnet/minecraft/advancements/Advancement$Builder;", cancellable = true)
    private static void advancement_1745057608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1745057608L))
            info.setReturnValue(new net.minecraft.advancements.Advancement$Builder());
    }

    @Inject(at = @At("HEAD"), method = "sendsTelemetryEvent()Lnet/minecraft/advancements/Advancement$Builder;", cancellable = true)
    private void sendsTelemetryEvent_1745057360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1745057360L))
            info.setReturnValue(new net.minecraft.advancements.Advancement$Builder());
    }

    @Inject(at = @At("HEAD"), method = "addCriterion(Ljava/lang/String;Lnet/minecraft/advancements/triggers/Criterion;)Lnet/minecraft/advancements/Advancement$Builder;", cancellable = true)
    private void addCriterion_1040073112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1040073112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recipeAdvancement()Lnet/minecraft/advancements/Advancement$Builder;", cancellable = true)
    private static void recipeAdvancement_1745057608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1745057608L))
            info.setReturnValue(new net.minecraft.advancements.Advancement$Builder());
    }

    @Inject(at = @At("HEAD"), method = "requirements(Lnet/minecraft/advancements/AdvancementRequirements;)Lnet/minecraft/advancements/Advancement$Builder;", cancellable = true)
    private void requirements_378465865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(378465865L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requirements(Lnet/minecraft/advancements/AdvancementRequirements$Strategy;)Lnet/minecraft/advancements/Advancement$Builder;", cancellable = true)
    private void requirements_246970408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(246970408L))
            info.setReturnValue(new net.minecraft.advancements.Advancement$Builder());
    }


}
