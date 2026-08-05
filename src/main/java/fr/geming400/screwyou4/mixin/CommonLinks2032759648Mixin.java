package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.CommonLinks.class)
public class CommonLinks2032759648Mixin {
        @Inject(at = @At("HEAD"), method = "extendRealms(Ljava/lang/String;Ljava/util/UUID;Z)Ljava/lang/String;", cancellable = true)
    private static void extendRealms__1470169227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1470169227L))
            info.setReturnValue("bUTd,ꉋ6s剗'Zc$zd璿c+쎍h(M%f[M|g#6녝Wz&EmvGퟩe댥`猸r흵N澌Z앆F&}:");
    }

    @Inject(at = @At("HEAD"), method = "extendRealms(Ljava/lang/String;Ljava/util/UUID;)Ljava/lang/String;", cancellable = true)
    private static void extendRealms__684619325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-684619325L))
            info.setReturnValue("/Rw/$Ku'\"d^KtX+n㹞K歏焊$?RFo|MQᨵ1b!<z'脨 5j簬I(sG(x>ꢚ+b쓑me6&ⶹrm7k瘥Zhd[");
    }


}
