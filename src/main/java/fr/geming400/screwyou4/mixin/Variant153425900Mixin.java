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
            info.setReturnValue("jzThJF=M\"dyx8{rG;|Y|2+ᚎF>(Du䳸ꃴﺱ䃲w&b'Xㄦ|66kV\"w.Yn0)vONe/8켱꩓hkL7!獼ꏢ?whT膪q/Tf-XO4I#CSv87xꜻ쪃=fj::-_fS");
    }

    @Inject(at = @At("HEAD"), method = "getPrefixedRecipeGroup(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private void getPrefixedRecipeGroup_1366167723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1366167723L))
            info.setReturnValue("?翴2涙eivpt=Yi`얪`nn&a9m%RP@_bJ)!$,94mE愸C<o|7Wos tp⫩鹴WwVX>x+Ogw卬1&tE+H,");
    }

    @Inject(at = @At("HEAD"), method = "getBaseVariantForCrafting()Lnet/minecraft/data/BlockFamily$Variant;", cancellable = true)
    private void getBaseVariantForCrafting__1482418087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1482418087L))
            info.setReturnValue(net.minecraft.data.BlockFamily.Variant.TRAPDOOR);
    }


}
