package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.BlockStateData.class)
public class BlockStateData_912283344Mixin {
        @Inject(at = @At("HEAD"), method = "getTag(I)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void getTag_1159871559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1159871559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "upgradeBlock(I)Ljava/lang/String;", cancellable = true)
    private static void upgradeBlock__390024954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-390024954L))
            info.setReturnValue("f:C`\uCBE1<7");
    }

    @Inject(at = @At("HEAD"), method = "upgradeBlock(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void upgradeBlock_525965143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(525965143L))
            info.setReturnValue("\uCBDC'!8L'_\uCA3A\u74CD|k]fvk/W\u955A?Gb+2PA6-h^Q05N\u9366SSbqbISJgShM;\u33784ir7H\u9C97D\u1EAAiG>h4=&28W8d}NDoi}rXUI9VDXHOh");
    }

    @Inject(at = @At("HEAD"), method = "upgradeBlockStateTag(Lcom/mojang/serialization/Dynamic;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void upgradeBlockStateTag__1582884800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1582884800L))
            info.setReturnValue(null);
    }


}
