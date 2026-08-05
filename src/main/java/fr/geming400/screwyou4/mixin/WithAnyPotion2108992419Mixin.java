package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.SlotDisplay.WithAnyPotion.class)
public class WithAnyPotion2108992419Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/crafting/display/SlotDisplay$Type;", cancellable = true)
    private void type__1471139352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1471139352L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__800462618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-800462618L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_973532444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(973532444L))
            info.setReturnValue("T-pXꉢ⋟|a᭡@biYf疪J*6iA믝N쩢$vN⾔ᣫSJC表쓲哃#-s!UJ$w#Cuf>[E=Y✉n*T iU網.!5|sK5v|O9O#u>KT(");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2147255161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2147255161L))
            info.setReturnValue(-867397409);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/util/context/ContextMap;Lnet/minecraft/world/item/crafting/display/DisplayContentsFactory;)Ljava/util/stream/Stream;", cancellable = true)
    private void resolve_526876731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(526876731L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "display()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void display__1449021230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1449021230L))
            info.setReturnValue(null);
    }


}
