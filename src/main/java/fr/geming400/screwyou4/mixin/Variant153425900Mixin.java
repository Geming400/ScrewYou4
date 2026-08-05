package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.BlockFamily.Variant.class)
public class Variant153425900Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/data/BlockFamily$Variant;", cancellable = true)
    private static void values_1517717642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1517717642L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/data/BlockFamily$Variant;", cancellable = true)
    private static void valueOf__1253022201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1253022201L))
            info.setReturnValue(net.minecraft.data.BlockFamily.Variant.STAIRS);
    }

    @Inject(at = @At("HEAD"), method = "getRecipeGroup()Ljava/lang/String;", cancellable = true)
    private void getRecipeGroup__982034571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-982034571L))
            info.setReturnValue("jzThJF=M\"dyx8{rG;|Y|2+\u168EF>(Du\u4CF8\uA0F4\uFEB1\u40F2w&b'X\u3126|66kV\"w.Yn0)vONe/8\uCF31\uAA53hkL7!\u737C\uA3E2?whT\u81AAq/Tf-XO4I#CSv87x\uA73B\uCA83=fj::-_fS");
    }

    @Inject(at = @At("HEAD"), method = "getPrefixedRecipeGroup(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private void getPrefixedRecipeGroup_1366167723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1366167723L))
            info.setReturnValue("?\u7FF42\u6D99eivpt=Yi`\uC5AA`nn&a9m%RP@_bJ)!$,94mE\u6138C<o|7Wos tp\u2AE9\u9E74WwVX>x+Ogw\u536C1&tE+H,");
    }

    @Inject(at = @At("HEAD"), method = "getBaseVariantForCrafting()Lnet/minecraft/data/BlockFamily$Variant;", cancellable = true)
    private void getBaseVariantForCrafting__1482418087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1482418087L))
            info.setReturnValue(net.minecraft.data.BlockFamily.Variant.TRAPDOOR);
    }


}
