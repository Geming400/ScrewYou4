package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.SubStringSource.class)
public class SubStringSource2095042430Mixin {
        @Inject(at = @At("HEAD"), method = "substring(IIZ)Ljava/util/List;", cancellable = true)
    private void substring__1494497404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1494497404L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/network/chat/FormattedText;Lit/unimi/dsi/fastutil/ints/Int2IntFunction;Ljava/util/function/UnaryOperator;)Lnet/minecraft/network/chat/SubStringSource;", cancellable = true)
    private static void create_1789576574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1789576574L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/network/chat/FormattedText;)Lnet/minecraft/network/chat/SubStringSource;", cancellable = true)
    private static void create_168095986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(168095986L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlainText()Ljava/lang/String;", cancellable = true)
    private void getPlainText_959581959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(959581959L))
            info.setReturnValue("5B@@*=4yr!f?㖩Mm73gJM㲧FU)+_ goU0Xfq焋Drkq茛=)%zev1&ዶ嘰H6%LeoJSl➿MJ?RW^");
    }


}
