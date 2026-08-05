package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.Advancement.Builder.class)
public class Builder2115312049Mixin {
        @Inject(at = @At("HEAD"), method = "parent(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/advancements/Advancement$Builder;", cancellable = true)
    private void parent_2116367218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2116367218L))
            info.setReturnValue(new net.minecraft.advancements.Advancement.Builder());
    }

    @Inject(at = @At("HEAD"), method = "parent(Lnet/minecraft/advancements/AdvancementHolder;)Lnet/minecraft/advancements/Advancement$Builder;", cancellable = true)
    private void parent_388430991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(388430991L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "save(Ljava/util/function/Consumer;Ljava/lang/String;)Lnet/minecraft/advancements/AdvancementHolder;", cancellable = true)
    private void save_906148330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(906148330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "display(Lnet/minecraft/advancements/DisplayInfo;)Lnet/minecraft/advancements/Advancement$Builder;", cancellable = true)
    private void display__1722274549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1722274549L))
            info.setReturnValue(new net.minecraft.advancements.Advancement.Builder());
    }

    @Inject(at = @At("HEAD"), method = "display(Lnet/minecraft/world/level/ItemLike;Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/Component;Lnet/minecraft/resources/Identifier;Lnet/minecraft/advancements/AdvancementType;ZZZ)Lnet/minecraft/advancements/Advancement$Builder;", cancellable = true)
    private void display_1317321178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1317321178L))
            info.setReturnValue(new net.minecraft.advancements.Advancement.Builder());
    }

    @Inject(at = @At("HEAD"), method = "display(Lnet/minecraft/world/item/ItemStackTemplate;Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/Component;Lnet/minecraft/resources/Identifier;Lnet/minecraft/advancements/AdvancementType;ZZZ)Lnet/minecraft/advancements/Advancement$Builder;", cancellable = true)
    private void display_1324578044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1324578044L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/advancements/AdvancementHolder;", cancellable = true)
    private void build__1936648479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1936648479L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "advancement()Lnet/minecraft/advancements/Advancement$Builder;", cancellable = true)
    private static void advancement_1567978536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1567978536L))
            info.setReturnValue(new net.minecraft.advancements.Advancement.Builder());
    }

    @Inject(at = @At("HEAD"), method = "requirements(Lnet/minecraft/advancements/AdvancementRequirements$Strategy;)Lnet/minecraft/advancements/Advancement$Builder;", cancellable = true)
    private void requirements_330120600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(330120600L))
            info.setReturnValue(new net.minecraft.advancements.Advancement.Builder());
    }

    @Inject(at = @At("HEAD"), method = "requirements(Lnet/minecraft/advancements/AdvancementRequirements;)Lnet/minecraft/advancements/Advancement$Builder;", cancellable = true)
    private void requirements_1775323865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1775323865L))
            info.setReturnValue(new net.minecraft.advancements.Advancement.Builder());
    }

    @Inject(at = @At("HEAD"), method = "sendsTelemetryEvent()Lnet/minecraft/advancements/Advancement$Builder;", cancellable = true)
    private void sendsTelemetryEvent_2226556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2226556L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recipeAdvancement()Lnet/minecraft/advancements/Advancement$Builder;", cancellable = true)
    private static void recipeAdvancement__2103960390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2103960390L))
            info.setReturnValue(new net.minecraft.advancements.Advancement.Builder());
    }

    @Inject(at = @At("HEAD"), method = "addCriterion(Ljava/lang/String;Lnet/minecraft/advancements/triggers/Criterion;)Lnet/minecraft/advancements/Advancement$Builder;", cancellable = true)
    private void addCriterion_27215512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(27215512L))
            info.setReturnValue(new net.minecraft.advancements.Advancement.Builder());
    }

    @Inject(at = @At("HEAD"), method = "rewards(Lnet/minecraft/advancements/AdvancementRewards$Builder;)Lnet/minecraft/advancements/Advancement$Builder;", cancellable = true)
    private void rewards_1561791576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1561791576L))
            info.setReturnValue(new net.minecraft.advancements.Advancement.Builder());
    }

    @Inject(at = @At("HEAD"), method = "rewards(Lnet/minecraft/advancements/AdvancementRewards;)Lnet/minecraft/advancements/Advancement$Builder;", cancellable = true)
    private void rewards_137889537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(137889537L))
            info.setReturnValue(new net.minecraft.advancements.Advancement.Builder());
    }


}
