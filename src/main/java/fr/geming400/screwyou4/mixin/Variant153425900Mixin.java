package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.BlockFamily.Variant.class)
public class Variant153425900Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/data/BlockFamily$Variant;", cancellable = true)
    private static void values__278078808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-278078808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/data/BlockFamily$Variant;", cancellable = true)
    private static void valueOf_731370287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(731370287L))
            info.setReturnValue(net.minecraft.data.BlockFamily.Variant.CUT);
    }

    @Inject(at = @At("HEAD"), method = "getRecipeGroup()Ljava/lang/String;", cancellable = true)
    private void getRecipeGroup__120319600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-120319600L))
            info.setReturnValue("\u5D40C\u608EH]%3kDaaj6oq\u4BDE,rB'#M8d%>c\uCB75YyDa24*R0PR\uC5D3pON|Y6-b][v\uC401RGU*@hD\u0E41(\u9E6FdDu\u9FB9RNALE\u2231\u23D7{8BM`3,,&8e\uCF3E1@(t9cQ");
    }

    @Inject(at = @At("HEAD"), method = "getBaseVariantForCrafting()Lnet/minecraft/data/BlockFamily$Variant;", cancellable = true)
    private void getBaseVariantForCrafting_288906342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(288906342L))
            info.setReturnValue(net.minecraft.data.BlockFamily.Variant.FENCE);
    }

    @Inject(at = @At("HEAD"), method = "getPrefixedRecipeGroup(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private void getPrefixedRecipeGroup_1817809301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1817809301L))
            info.setReturnValue("ar@_t\u588A\uAC9Dz8Xd4'8P\uCB1EreZ#k@r6MpEflzs'p\uD142!V|GFC\u2B80EP]\u4B0F\u26FB\u5D20;\u31A5rcF_b\u54FCV\uF9DE");
    }


}
