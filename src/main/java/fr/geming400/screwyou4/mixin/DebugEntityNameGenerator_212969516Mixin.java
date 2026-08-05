package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.DebugEntityNameGenerator.class)
public class DebugEntityNameGenerator_212969516Mixin {
        @Inject(at = @At("HEAD"), method = "getEntityName(Lnet/minecraft/world/entity/Entity;)Ljava/lang/String;", cancellable = true)
    private static void getEntityName_625852915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(625852915L))
            info.setReturnValue("fmn0z4r쵗꺟tjHaUP;F+%鋝]셯K6CFAq`t.o緊-N)ezx/RRb)叄..ሪR&}6 RCTK#`돱F8]hoYG&no⮷cV^U|&7N9=M,%h}'Kc蕘");
    }

    @Inject(at = @At("HEAD"), method = "getEntityName(Ljava/util/UUID;)Ljava/lang/String;", cancellable = true)
    private static void getEntityName__981454504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-981454504L))
            info.setReturnValue("f4\"/Wᚙ'p 撛I2]n![@紆낧]t<a}㖬4ndhoNcmr28kM:FSꚺg8ZS!)l#>2/");
    }


}
