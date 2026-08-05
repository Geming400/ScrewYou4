package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.AdvancementNode.class)
public class AdvancementNode404681140Mixin {
        @Inject(at = @At("HEAD"), method = "parent()Lnet/minecraft/advancements/AdvancementNode;", cancellable = true)
    private void parent__1127206488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1127206488L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1790192903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1790192903L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__730779331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-730779331L))
            info.setReturnValue("$<anO䳄ONἍPWBr=(),8I");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_442943386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(442943386L))
            info.setReturnValue(206748000);
    }

    @Inject(at = @At("HEAD"), method = "holder()Lnet/minecraft/advancements/AdvancementHolder;", cancellable = true)
    private void holder__2110644610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2110644610L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "root()Lnet/minecraft/advancements/AdvancementNode;", cancellable = true)
    private void root__1127206488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1127206488L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRoot(Lnet/minecraft/advancements/AdvancementNode;)Lnet/minecraft/advancements/AdvancementNode;", cancellable = true)
    private static void getRoot_1458716811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1458716811L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "children()Ljava/lang/Iterable;", cancellable = true)
    private void children__1605068548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1605068548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/advancements/AdvancementNode;)V", cancellable = true)
    private void addChild__1848409252(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1848409252L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "advancement()Lnet/minecraft/advancements/Advancement;", cancellable = true)
    private void advancement_1398232458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1398232458L))
            info.setReturnValue(null);
    }


}
