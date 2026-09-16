package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.attributes.AttributeInstance.class)
public class AttributeInstance312354915Mixin {
        @Inject(at = @At("HEAD"), method = "getValue()D", cancellable = true)
    private void getValue_2004897961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2004897961L))
            info.setReturnValue(2.5091470012956643E8D);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/entity/ai/attributes/AttributeInstance$Packed;)V", cancellable = true)
    private void apply__354117820(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-354117820L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getModifiers()Ljava/util/Set;", cancellable = true)
    private void getModifiers__656888065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-656888065L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAttribute()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getAttribute_439420857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(439420857L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pack()Lnet/minecraft/world/entity/ai/attributes/AttributeInstance$Packed;", cancellable = true)
    private void pack__1869418409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1869418409L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeModifiers()V", cancellable = true)
    private void removeModifiers_1500008894(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1500008894L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBaseValue(D)V", cancellable = true)
    private void setBaseValue_422240872(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(422240872L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addTransientModifier(Lnet/minecraft/world/entity/ai/attributes/AttributeModifier;)V", cancellable = true)
    private void addTransientModifier_1452724094(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1452724094L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getModifier(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/world/entity/ai/attributes/AttributeModifier;", cancellable = true)
    private void getModifier__499660369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-499660369L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBaseValue()D", cancellable = true)
    private void getBaseValue__130173094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-130173094L))
            info.setReturnValue(2.509147006244225E8D);
    }

    @Inject(at = @At("HEAD"), method = "removeModifier(Lnet/minecraft/resources/Identifier;)Z", cancellable = true)
    private void removeModifier_416228743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(416228743L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "removeModifier(Lnet/minecraft/world/entity/ai/attributes/AttributeModifier;)V", cancellable = true)
    private void removeModifier_535575619(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(535575619L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addPermanentModifier(Lnet/minecraft/world/entity/ai/attributes/AttributeModifier;)V", cancellable = true)
    private void addPermanentModifier_765027802(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(765027802L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addOrUpdateTransientModifier(Lnet/minecraft/world/entity/ai/attributes/AttributeModifier;)V", cancellable = true)
    private void addOrUpdateTransientModifier__691958742(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-691958742L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasModifier(Lnet/minecraft/resources/Identifier;)Z", cancellable = true)
    private void hasModifier__1369697743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1369697743L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "replaceFrom(Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;)V", cancellable = true)
    private void replaceFrom_1505075362(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1505075362L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addPermanentModifiers(Ljava/util/Collection;)V", cancellable = true)
    private void addPermanentModifiers__1782965384(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1782965384L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPermanentModifiers()Ljava/util/Set;", cancellable = true)
    private void getPermanentModifiers_819887777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(819887777L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addOrReplacePermanentModifier(Lnet/minecraft/world/entity/ai/attributes/AttributeModifier;)V", cancellable = true)
    private void addOrReplacePermanentModifier__455597271(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-455597271L))
            info.cancel();
    }


}
