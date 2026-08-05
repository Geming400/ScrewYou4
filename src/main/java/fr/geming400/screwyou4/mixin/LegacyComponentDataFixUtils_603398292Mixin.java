package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.LegacyComponentDataFixUtils.class)
public class LegacyComponentDataFixUtils_603398292Mixin {
        @Inject(at = @At("HEAD"), method = "isStrictlyValidJson(Lcom/mojang/serialization/Dynamic;)Z", cancellable = true)
    private static void isStrictlyValidJson__1604234368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1604234368L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractTranslationString(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private static void extractTranslationString__1681533201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1681533201L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createTranslatableComponentJson(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void createTranslatableComponentJson_1816140362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1816140362L))
            info.setReturnValue("\u6821r_26\u802A--?|\u514F$=$h6@V\u6C33OjT\uAF1Ez\uD102!(Cr\u67C0xb{\u9BF4y\u647B7h-\u4AD08)Dkk;=Kk\u92B1ZvG\u7FE9");
    }

    @Inject(at = @At("HEAD"), method = "createTranslatableComponent(Lcom/mojang/serialization/DynamicOps;Ljava/lang/String;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void createTranslatableComponent_886712328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(886712328L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createTextComponentJson(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void createTextComponentJson_1816140362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1816140362L))
            info.setReturnValue("\u6821r_26\u802A--?|\u514F$=$h6@V\u6C33OjT\uAF1Ez\uD102!(Cr\u67C0xb{\u9BF4y\u647B7h-\u4AD08)Dkk;=Kk\u92B1ZvG\u7FE9");
    }

    @Inject(at = @At("HEAD"), method = "rewriteFromLenient(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void rewriteFromLenient_1816140362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1816140362L))
            info.setReturnValue("\u6821r_26\u802A--?|\u514F$=$h6@V\u6C33OjT\uAF1Ez\uD102!(Cr\u67C0xb{\u9BF4y\u647B7h-\u4AD08)Dkk;=Kk\u92B1ZvG\u7FE9");
    }

    @Inject(at = @At("HEAD"), method = "createPlainTextComponent(Lcom/mojang/serialization/DynamicOps;Ljava/lang/String;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void createPlainTextComponent_886712328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(886712328L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createEmptyComponent(Lcom/mojang/serialization/DynamicOps;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void createEmptyComponent__1031927470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1031927470L))
            info.setReturnValue(null);
    }


}
