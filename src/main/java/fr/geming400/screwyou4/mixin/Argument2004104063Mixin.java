package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.SignableCommand.Argument.class)
public class Argument2004104063Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name__1481596077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1481596077L))
            info.setReturnValue("[zJb!IU}$N2I}h0\uA4C05G=29)}00\uAB62$y5\uC414:9\uCF4B@$(2B{m?&m\u9744+&P");
    }

    @Inject(at = @At("HEAD"), method = "value()Ljava/lang/String;", cancellable = true)
    private void value__1994069575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1994069575L))
            info.setReturnValue("w%^#LhWJ]yncc_Y(f Qv\u736AF%Z`r_-4ns`.F6a\uFBE7&K'SRw7u\uFE46%h\uB5F4:&_\u0F6A_\u55DADp2&#3\uCA6B4P) ");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1095477795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1095477795L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1520439708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1520439708L))
            info.setReturnValue("Ybviq+D\"GK0");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1733511142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1733511142L))
            info.setReturnValue(1747555063);
    }

    @Inject(at = @At("HEAD"), method = "node()Lcom/mojang/brigadier/tree/ArgumentCommandNode;", cancellable = true)
    private void node__324541495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-324541495L))
            info.setReturnValue(null);
    }


}
