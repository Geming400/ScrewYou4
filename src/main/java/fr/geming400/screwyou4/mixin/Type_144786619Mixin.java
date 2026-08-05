package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.quickplay.QuickPlayLog.Type.class)
public class Type_144786619Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/quickplay/QuickPlayLog$Type;", cancellable = true)
    private static void values__1801882438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1801882438L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/quickplay/QuickPlayLog$Type;", cancellable = true)
    private static void valueOf_906539137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(906539137L))
            info.setReturnValue(net.minecraft.client.quickplay.QuickPlayLog.Type.REALMS);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_232995240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(232995240L))
            info.setReturnValue("z\u2F55/!:6w *r,\u9CBD^0\u5ECA/3`\u21F5iDx\u4499_qd\u5087B%7cO\uA1D16\uD5C2\u7789!p0\u215B}e$}^#Lq\u590B\u5244Jy\u7C1BD_;q\u1E2BegQ;=S,sV\")U");
    }


}
