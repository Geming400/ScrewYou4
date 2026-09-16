package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.NativeModuleLister.NativeModuleVersion.class)
public class NativeModuleVersion1394617629Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_485991361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(485991361L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2129926638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2129926638L))
            info.setReturnValue("\u3FF7a&UmG\u75E2#^*\u96FC;b.hKk9/A/Z\u9716MR\u1F70QeC2Pz");
    }

    @Inject(at = @At("HEAD"), method = "version()Ljava/lang/String;", cancellable = true)
    private void version__716974210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-716974210L))
            info.setReturnValue("<vWpe9aP3yLx>a\u65CEjeSi@ uQ=@xNPQimPc0^@");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1951969720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1951969720L))
            info.setReturnValue(-1643125118);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description_220629922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(220629922L))
            info.setReturnValue("\u5321;_\u1910ijE]E\u3C5A0:/t1t{CYYw>^1t:p>5=?/'#5T\u3957\uBA79&uB\uA001wCK AZS |X}A4p\uBC72tJw>*%ZI}\u39A8x\u614EX\u7C54||dbB\u4FC6V\uA03BbEW8(a=#n<s ");
    }

    @Inject(at = @At("HEAD"), method = "company()Ljava/lang/String;", cancellable = true)
    private void company_452754787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(452754787L))
            info.setReturnValue("q'f}[\u4F72Ug&\u30D9[:");
    }


}
