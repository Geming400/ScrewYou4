package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.EnumProperty.class)
public class EnumProperty_602473310Mixin {
        @Inject(at = @At("HEAD"), method = "getName(Ljava/lang/Enum;)Ljava/lang/String;", cancellable = true)
    private void getName_432807245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(432807245L))
            info.setReturnValue("\u71474#mj'\u97B4'ZS{Qdx+BWTlj\u810FZo\uA568Mc_;*U\uB449}eG#<o\uC9ABGw/<od=R_!,y\u70BC}\uCD57\u47A1+\u4A9DRdGU");
    }

    @Inject(at = @At("HEAD"), method = "getName(Ljava/lang/Comparable;)Ljava/lang/String;", cancellable = true)
    private void getName_1170032998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1170032998L))
            info.setReturnValue("$qN8%\u5FF1B+\u6602Kd\uFDBB\u4E41\uA17A&\uBF07%dm_\u799F?`\u68E7\u775F\u2210q(#Q?vuR{J eQ\u4554ZF\u94FC]2<u1;*e\u4A7FbQv\u5CEA+Qb&0h-yWhw\u17B5\u92F0+\uA279y_3fn\u89C1k+2");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__306153455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-306153455L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getValue(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getValue_1511593660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1511593660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;Ljava/lang/Class;Ljava/util/function/Predicate;)Lnet/minecraft/world/level/block/state/properties/EnumProperty;", cancellable = true)
    private static void create__1544245289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1544245289L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Enum;)Lnet/minecraft/world/level/block/state/properties/EnumProperty;", cancellable = true)
    private static void create_769344515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(769344515L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;Ljava/lang/Class;Ljava/util/List;)Lnet/minecraft/world/level/block/state/properties/EnumProperty;", cancellable = true)
    private static void create_1016186937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1016186937L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;Ljava/lang/Class;)Lnet/minecraft/world/level/block/state/properties/EnumProperty;", cancellable = true)
    private static void create__1529825464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1529825464L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateHashCode()I", cancellable = true)
    private void generateHashCode_230680211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(230680211L))
            info.setReturnValue(1151950359);
    }

    @Inject(at = @At("HEAD"), method = "getInternalIndex(Ljava/lang/Comparable;)I", cancellable = true)
    private void getInternalIndex_1138263589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1138263589L))
            info.setReturnValue(2093667041);
    }

    @Inject(at = @At("HEAD"), method = "getInternalIndex(Ljava/lang/Enum;)I", cancellable = true)
    private void getInternalIndex_1336759646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1336759646L))
            info.setReturnValue(-1697583183);
    }

    @Inject(at = @At("HEAD"), method = "getPossibleValues()Ljava/util/List;", cancellable = true)
    private void getPossibleValues_401312246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(401312246L))
            info.setReturnValue(null);
    }


}
