package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.QuartPos.class)
public class QuartPos543516721Mixin {
        @Inject(at = @At("HEAD"), method = "toSection(I)I", cancellable = true)
    private static void toSection_1212276722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1212276722L))
            info.setReturnValue(1259909826);
    }

    @Inject(at = @At("HEAD"), method = "toBlock(I)I", cancellable = true)
    private static void toBlock__703408934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-703408934L))
            info.setReturnValue(1560449320);
    }

    @Inject(at = @At("HEAD"), method = "fromBlock(I)I", cancellable = true)
    private static void fromBlock__2142205877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2142205877L))
            info.setReturnValue(-700184351);
    }

    @Inject(at = @At("HEAD"), method = "quartLocal(I)I", cancellable = true)
    private static void quartLocal_1995629428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1995629428L))
            info.setReturnValue(949802768);
    }

    @Inject(at = @At("HEAD"), method = "fromSection(I)I", cancellable = true)
    private static void fromSection_1507883811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1507883811L))
            info.setReturnValue(2144626243);
    }


}
