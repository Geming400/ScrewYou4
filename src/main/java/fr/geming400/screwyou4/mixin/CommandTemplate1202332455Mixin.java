package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.action.CommandTemplate.class)
public class CommandTemplate1202332455Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1707122582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1707122582L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_66872480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(66872480L))
            info.setReturnValue("futO0<隇ఈrM顦ta覫g(W&6kw䒎#b=P/_;mf切=h%(鏠7WvnืYZ2<k990E螒V-n,^Rp{OQk捵mbꐵqภR홁@oeꁔ瓺B燀=%_J2邙7꾯2+I㻔xy6ỷ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1240595197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1240595197L))
            info.setReturnValue(712614390);
    }

    @Inject(at = @At("HEAD"), method = "template()Lnet/minecraft/server/dialog/action/ParsedTemplate;", cancellable = true)
    private void template_1725638326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1725638326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1356781117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1356781117L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAction(Ljava/util/Map;)Ljava/util/Optional;", cancellable = true)
    private void createAction__1704934470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1704934470L))
            info.setReturnValue(null);
    }


}
