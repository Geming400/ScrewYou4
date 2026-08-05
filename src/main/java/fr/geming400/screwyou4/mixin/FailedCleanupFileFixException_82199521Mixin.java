package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.FailedCleanupFileFixException.class)
public class FailedCleanupFileFixException_82199521Mixin {
        @Inject(at = @At("HEAD"), method = "newWorldFolderName()Ljava/lang/String;", cancellable = true)
    private void newWorldFolderName__1053260951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1053260951L))
            info.setReturnValue("|E\u3049[&!<5lQ\u59E1]+@N4=p\u2F74`M\u8424|/.+F!c!8Ac#OpH\u5A7E$tR\uA00DAl ?5XB\u9A61+Wb3NzT6vw eV\u7F96/F\uBFE7'\u2BE9&k\u1312t\"xflc2h\u6B2CC8@w\u56392");
    }


}
