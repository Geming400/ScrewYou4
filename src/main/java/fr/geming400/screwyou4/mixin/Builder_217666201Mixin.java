package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.AdvancementRewards.Builder.class)
public class Builder_217666201Mixin {
        @Inject(at = @At("HEAD"), method = "function(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/advancements/AdvancementRewards$Builder;", cancellable = true)
    private static void function_1386483929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1386483929L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/advancements/AdvancementRewards;", cancellable = true)
    private void build__1829866864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1829866864L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recipe(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/advancements/AdvancementRewards$Builder;", cancellable = true)
    private static void recipe__1096043563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1096043563L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "runs(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/advancements/AdvancementRewards$Builder;", cancellable = true)
    private void runs_1386483681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1386483681L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addLootTable(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/advancements/AdvancementRewards$Builder;", cancellable = true)
    private void addLootTable__1096043811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1096043811L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addExperience(I)Lnet/minecraft/advancements/AdvancementRewards$Builder;", cancellable = true)
    private void addExperience__800697070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-800697070L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "experience(I)Lnet/minecraft/advancements/AdvancementRewards$Builder;", cancellable = true)
    private static void experience__800696822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-800696822L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addRecipe(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/advancements/AdvancementRewards$Builder;", cancellable = true)
    private void addRecipe__1096043811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1096043811L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loot(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/advancements/AdvancementRewards$Builder;", cancellable = true)
    private static void loot__1096043563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1096043563L))
            info.setReturnValue(null);
    }


}
