package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.SlotDisplay.WithAnyPotion.class)
public class WithAnyPotion2108992419Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/crafting/display/SlotDisplay$Type;", cancellable = true)
    private void type__1980763870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1980763870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1200366151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1200366151L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1415551352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1415551352L))
            info.setReturnValue("\u4518\u5D6CG{\u85F9W=4=g.i@P\uC2B4\u8DE6L\u60E9xd\u2465:o\"Sc");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1628622786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1628622786L))
            info.setReturnValue(-1380566406);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/util/context/ContextMap;Lnet/minecraft/world/item/crafting/display/DisplayContentsFactory;)Ljava/util/stream/Stream;", cancellable = true)
    private void resolve__386981593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-386981593L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "display()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void display_1691203280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1691203280L))
            info.setReturnValue(null);
    }


}
