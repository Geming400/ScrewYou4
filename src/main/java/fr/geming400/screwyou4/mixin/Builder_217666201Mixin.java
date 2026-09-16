package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.AdvancementRewards.Builder.class)
public class Builder_217666201Mixin {
        @Inject(at = @At("HEAD"), method = "function(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/advancements/AdvancementRewards$Builder;", cancellable = true)
    private static void function_683598337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(683598337L))
            info.setReturnValue(new net.minecraft.advancements.AdvancementRewards.Builder());
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/advancements/AdvancementRewards;", cancellable = true)
    private void build_535511394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(535511394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recipe(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/advancements/AdvancementRewards$Builder;", cancellable = true)
    private static void recipe_181723491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(181723491L))
            info.setReturnValue(new net.minecraft.advancements.AdvancementRewards.Builder());
    }

    @Inject(at = @At("HEAD"), method = "runs(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/advancements/AdvancementRewards$Builder;", cancellable = true)
    private void runs_1697894297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1697894297L))
            info.setReturnValue(new net.minecraft.advancements.AdvancementRewards.Builder());
    }

    @Inject(at = @At("HEAD"), method = "experience(I)Lnet/minecraft/advancements/AdvancementRewards$Builder;", cancellable = true)
    private static void experience_397255796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(397255796L))
            info.setReturnValue(new net.minecraft.advancements.AdvancementRewards.Builder());
    }

    @Inject(at = @At("HEAD"), method = "loot(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/advancements/AdvancementRewards$Builder;", cancellable = true)
    private static void loot__380593539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-380593539L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addRecipe(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/advancements/AdvancementRewards$Builder;", cancellable = true)
    private void addRecipe__706495380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-706495380L))
            info.setReturnValue(new net.minecraft.advancements.AdvancementRewards.Builder());
    }

    @Inject(at = @At("HEAD"), method = "addLootTable(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/advancements/AdvancementRewards$Builder;", cancellable = true)
    private void addLootTable_228028738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(228028738L))
            info.setReturnValue(new net.minecraft.advancements.AdvancementRewards.Builder());
    }

    @Inject(at = @At("HEAD"), method = "addExperience(I)Lnet/minecraft/advancements/AdvancementRewards$Builder;", cancellable = true)
    private void addExperience_157598589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(157598589L))
            info.setReturnValue(new net.minecraft.advancements.AdvancementRewards.Builder());
    }


}
