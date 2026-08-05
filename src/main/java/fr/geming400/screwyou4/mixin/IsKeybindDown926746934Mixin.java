package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.conditional.IsKeybindDown.class)
public class IsKeybindDown926746934Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Z", cancellable = true)
    private void get__1354168848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1354168848L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1632366638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1632366638L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1982708103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1982708103L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__208713041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-208713041L))
            info.setReturnValue(". P_Rv1@Y'rLk[/wm@\"%R3ixpQᅞpqdjKi:/䚷k{(*P陃U4=Qxᒾ᭭8g⌊Q!ￆ*G06繒P@4N3˨^t6<au0﹑46!t }'W1@y-9u%uV#䬧&Ur䖠L");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_965009676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(965009676L))
            info.setReturnValue(197933036);
    }

    @Inject(at = @At("HEAD"), method = "keybind()Lnet/minecraft/client/KeyMapping;", cancellable = true)
    private void keybind_1180327547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1180327547L))
            info.setReturnValue(null);
    }


}
