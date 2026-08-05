package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.attributes.AttributeInstance.class)
public class AttributeInstance312354915Mixin {
        @Inject(at = @At("HEAD"), method = "getValue()D", cancellable = true)
    private void getValue_350612356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(350612356L))
            info.setReturnValue(6.774532005857092E8D);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/entity/ai/attributes/AttributeInstance$Packed;)V", cancellable = true)
    private void apply__637087274(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-637087274L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getModifiers()Ljava/util/Set;", cancellable = true)
    private void getModifiers__1516680571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1516680571L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAttribute()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getAttribute_1861230687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1861230687L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pack()Lnet/minecraft/world/entity/ai/attributes/AttributeInstance$Packed;", cancellable = true)
    private void pack__2135037808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2135037808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPermanentModifiers()Ljava/util/Set;", cancellable = true)
    private void getPermanentModifiers__1516680571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1516680571L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addPermanentModifiers(Ljava/util/Collection;)V", cancellable = true)
    private void addPermanentModifiers_1763675847(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1763675847L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addOrReplacePermanentModifier(Lnet/minecraft/world/entity/ai/attributes/AttributeModifier;)V", cancellable = true)
    private void addOrReplacePermanentModifier_389091422(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(389091422L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeModifier(Lnet/minecraft/resources/Identifier;)Z", cancellable = true)
    private void removeModifier__1182082398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1182082398L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "removeModifier(Lnet/minecraft/world/entity/ai/attributes/AttributeModifier;)V", cancellable = true)
    private void removeModifier_389091422(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(389091422L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addPermanentModifier(Lnet/minecraft/world/entity/ai/attributes/AttributeModifier;)V", cancellable = true)
    private void addPermanentModifier_389091422(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(389091422L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBaseValue(D)V", cancellable = true)
    private void setBaseValue_1521654282(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1521654282L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addTransientModifier(Lnet/minecraft/world/entity/ai/attributes/AttributeModifier;)V", cancellable = true)
    private void addTransientModifier_389091422(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(389091422L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getModifier(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/world/entity/ai/attributes/AttributeModifier;", cancellable = true)
    private void getModifier_214422498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(214422498L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBaseValue()D", cancellable = true)
    private void getBaseValue_350612356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(350612356L))
            info.setReturnValue(6.774532005857092E8D);
    }

    @Inject(at = @At("HEAD"), method = "hasModifier(Lnet/minecraft/resources/Identifier;)Z", cancellable = true)
    private void hasModifier__1182082398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1182082398L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "addOrUpdateTransientModifier(Lnet/minecraft/world/entity/ai/attributes/AttributeModifier;)V", cancellable = true)
    private void addOrUpdateTransientModifier_389091422(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(389091422L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "replaceFrom(Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;)V", cancellable = true)
    private void replaceFrom_806741344(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(806741344L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeModifiers()V", cancellable = true)
    private void removeModifiers_350629654(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(350629654L))
            info.cancel();
    }


}
