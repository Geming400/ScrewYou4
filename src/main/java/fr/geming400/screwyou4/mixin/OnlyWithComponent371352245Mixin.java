package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.SlotDisplay.OnlyWithComponent.class)
public class OnlyWithComponent371352245Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/crafting/display/SlotDisplay$Type;", cancellable = true)
    private void type_576563252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(576563252L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__537274023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-537274023L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1141775770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1141775770L))
            info.setReturnValue("T\u995C\u0821)L(\uCF91AV\u93EE#yN\u8A48:D>e\"EFN<XEb$]Rywf\uBDD6qa(2YKz-\u1B68D \uBB75bru`.v&QG1");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_928704336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(928704336L))
            info.setReturnValue(-610540049);
    }

    @Inject(at = @At("HEAD"), method = "component()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void component_859172289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(859172289L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/util/context/ContextMap;Lnet/minecraft/world/item/crafting/display/DisplayContentsFactory;)Ljava/util/stream/Stream;", cancellable = true)
    private void resolve__2124621767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2124621767L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "source()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void source__897289495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-897289495L))
            info.setReturnValue(null);
    }


}
