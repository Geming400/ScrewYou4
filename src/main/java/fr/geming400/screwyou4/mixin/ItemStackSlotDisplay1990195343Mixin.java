package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.SlotDisplay.ItemStackSlotDisplay.class)
public class ItemStackSlotDisplay1990195343Mixin {
        @Inject(at = @At("HEAD"), method = "stack()Lnet/minecraft/world/item/ItemStackTemplate;", cancellable = true)
    private void stack__243090079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-243090079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/crafting/display/SlotDisplay$Type;", cancellable = true)
    private void type__2099560946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2099560946L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1081569075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1081569075L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1534348428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1534348428L))
            info.setReturnValue("S[xT+E\uA155.6.r\u11DFt^}&uXp\u25A9Y\u6012l3o\uCCF7s0%.:V/V\u703C-y=W/33$J?Lf03}TaK7|jJ\u9ED1aLuq_\uBADE\u8C7D'RB%2w!bL\u1A99+?K7[$ghz`J}\u8C82Q672q");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1747419862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1747419862L))
            info.setReturnValue(560858451);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/util/context/ContextMap;Lnet/minecraft/world/item/crafting/display/DisplayContentsFactory;)Ljava/util/stream/Stream;", cancellable = true)
    private void resolve__505778669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-505778669L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled(Lnet/minecraft/world/flag/FeatureFlagSet;)Z", cancellable = true)
    private void isEnabled_748295778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(748295778L))
            info.setReturnValue(true);
    }


}
