package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.SlotDisplay.WithRemainder.class)
public class WithRemainder1965092265Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/crafting/display/SlotDisplay$Type;", cancellable = true)
    private void type__1615039506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1615039506L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__944362772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-944362772L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_829632290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(829632290L))
            info.setReturnValue("}YxSP*A\u7DD1\u9A20\u05F4oq=ko\u9BBCg@B$tc';&a<*VU\uFF68|vl!mc");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2003355007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2003355007L))
            info.setReturnValue(-915935223);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/util/context/ContextMap;Lnet/minecraft/world/item/crafting/display/DisplayContentsFactory;)Ljava/util/stream/Stream;", cancellable = true)
    private void resolve_382976577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(382976577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled(Lnet/minecraft/world/flag/FeatureFlagSet;)Z", cancellable = true)
    private void isEnabled_535322885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(535322885L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "input()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void input__1592921384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1592921384L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "remainder()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void remainder__1592921384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1592921384L))
            info.setReturnValue(null);
    }


}
