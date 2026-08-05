package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.input.PreeditEvent.class)
public class PreeditEvent1300836985Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_392210717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(392210717L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2071260510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2071260510L))
            info.setReturnValue("\u3315dP/ylR^\u16DBDQp\u4B79 -Gr'fl\uB2F48v\"=q`m)Py|\u75A8@;%QujH");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1858189076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1858189076L))
            info.setReturnValue(-1971807810);
    }

    @Inject(at = @At("HEAD"), method = "blocks()Ljava/util/List;", cancellable = true)
    private void blocks_8515375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(8515375L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toFormattedText(Lnet/minecraft/network/chat/Style;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void toFormattedText_1501025238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1501025238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "caretPosition()I", cancellable = true)
    private void caretPosition__1923574253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1923574253L))
            info.setReturnValue(-652374335);
    }

    @Inject(at = @At("HEAD"), method = "focusedBlock()I", cancellable = true)
    private void focusedBlock_1364054729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1364054729L))
            info.setReturnValue(1524142546);
    }

    @Inject(at = @At("HEAD"), method = "createFromCallback(IJIJII)Lnet/minecraft/client/input/PreeditEvent;", cancellable = true)
    private static void createFromCallback_1150922058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1150922058L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fullText()Ljava/lang/String;", cancellable = true)
    private void fullText_2015330654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2015330654L))
            info.setReturnValue("'<qq^]tfj]9t\"w*u\u6825${@ i9\u7FA3$nB&?B_Z [%,UQN{dr\u8E5Bv\uFBE8i%L!iHS\u541Ay|76h<b?]\u3F0A.a&EV\" ]");
    }


}
