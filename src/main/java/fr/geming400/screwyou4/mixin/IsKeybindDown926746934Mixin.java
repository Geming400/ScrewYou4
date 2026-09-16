package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.conditional.IsKeybindDown.class)
public class IsKeybindDown926746934Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Z", cancellable = true)
    private void get_1057869510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1057869510L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__468503720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-468503720L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_18120666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(18120666L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1697170459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1697170459L))
            info.setReturnValue("6! }l,]q:A`PN}X\uB1DBG$cc.5mX40@<\uC2D8361bJ\u0195p}RTH^O|$\u85EB\u39F7uVJB9S&W{?a\u43F6\uC0EB-dUf!+2n^DIO<\u3C43=Z;n\u81530u\u5DB2!?')7");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1484099025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1484099025L))
            info.setReturnValue(1302065341);
    }

    @Inject(at = @At("HEAD"), method = "keybind()Lnet/minecraft/client/KeyMapping;", cancellable = true)
    private void keybind__1541872417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1541872417L))
            info.setReturnValue(null);
    }


}
