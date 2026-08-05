package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.ListTag.class)
public class ListTag1265649470Mixin {
        @Inject(at = @At("HEAD"), method = "remove(I)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void remove_862065320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(862065320L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "remove(I)Ljava/lang/Object;", cancellable = true)
    private void remove__1595148228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1595148228L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1709381059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1709381059L))
            info.setReturnValue(938197465);
    }

    @Inject(at = @At("HEAD"), method = "get(I)Ljava/lang/Object;", cancellable = true)
    private void get__1082927830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1082927830L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "get(I)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void get_293935738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(293935738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_357022706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(357022706L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2036072499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2036072499L))
            info.setReturnValue("\u9004*1\u60E8WH))uT\u4D63R[A_IF\u32C0pFfk$*yL(gS\u38D6p\u7759PTxgbC_c\uC7C9001y-OU!e\u7901@^H({M-0P49)<17]W18'^z.");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1823001065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1823001065L))
            info.setReturnValue(-1959154144);
    }

    @Inject(at = @At("HEAD"), method = "getShort(I)Ljava/util/Optional;", cancellable = true)
    private void getShort_466062285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(466062285L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInt(I)Ljava/util/Optional;", cancellable = true)
    private void getInt_112653626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(112653626L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFloat(I)Ljava/util/Optional;", cancellable = true)
    private void getFloat__371176979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-371176979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDouble(I)Ljava/util/Optional;", cancellable = true)
    private void getDouble_1153428204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1153428204L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_479821764(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(479821764L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void copy__300728426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-300728426L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/ListTag;", cancellable = true)
    private void copy__1897885292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1897885292L))
            info.setReturnValue(new net.minecraft.nbt.ListTag());
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty__1970201454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1970201454L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "add(ILnet/minecraft/nbt/Tag;)V", cancellable = true)
    private void add__1137782377(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1137782377L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(ILjava/lang/Object;)V", cancellable = true)
    private void add__1574673113(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1574673113L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stream()Ljava/util/stream/Stream;", cancellable = true)
    private void stream_527960115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(527960115L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(ILnet/minecraft/nbt/Tag;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void set__139732432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-139732432L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(ILjava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void set__588420798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-588420798L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getId()B", cancellable = true)
    private void getId__392680852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-392680852L))
            info.setReturnValue(13);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/StreamTagVisitor;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void accept_908609691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(908609691L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.HALT);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/TagVisitor;)V", cancellable = true)
    private void accept__443442271(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-443442271L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "write(Ljava/io/DataOutput;)V", cancellable = true)
    private void write__1656885382(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1656885382L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void getType__1568188639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1568188639L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asList()Ljava/util/Optional;", cancellable = true)
    private void asList__449597220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-449597220L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getString(I)Ljava/util/Optional;", cancellable = true)
    private void getString_299847340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(299847340L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sizeInBytes()I", cancellable = true)
    private void sizeInBytes_720412991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(720412991L))
            info.setReturnValue(1432253038);
    }

    @Inject(at = @At("HEAD"), method = "getList(I)Ljava/util/Optional;", cancellable = true)
    private void getList_1990701375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1990701375L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStringOr(ILjava/lang/String;)Ljava/lang/String;", cancellable = true)
    private void getStringOr__1261086502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1261086502L))
            info.setReturnValue("(CTan;-uG+%l.Of5\u3AA1eP\u9C113J/\u958A+6\u6776(/C9vSfQa Cy9`O.F\u5AF7';BdHc; S8)Nq6+dF\"y\uC180W;2'iB?u4X[WB]Wy&@");
    }

    @Inject(at = @At("HEAD"), method = "getListOrEmpty(I)Lnet/minecraft/nbt/ListTag;", cancellable = true)
    private void getListOrEmpty__617873320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-617873320L))
            info.setReturnValue(new net.minecraft.nbt.ListTag());
    }

    @Inject(at = @At("HEAD"), method = "getLongArray(I)Ljava/util/Optional;", cancellable = true)
    private void getLongArray__406034644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-406034644L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCompound(I)Ljava/util/Optional;", cancellable = true)
    private void getCompound_186235858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(186235858L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIntArray(I)Ljava/util/Optional;", cancellable = true)
    private void getIntArray__808162637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-808162637L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCompoundOrEmpty(I)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getCompoundOrEmpty__1952423688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1952423688L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "getDoubleOr(ID)D", cancellable = true)
    private void getDoubleOr_634122672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(634122672L))
            info.setReturnValue(8.434140028219156E7D);
    }

    @Inject(at = @At("HEAD"), method = "getShortOr(IS)S", cancellable = true)
    private void getShortOr__1281421969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1281421969L))
            info.setReturnValue((short) 4182);
    }

    @Inject(at = @At("HEAD"), method = "getFloatOr(IF)F", cancellable = true)
    private void getFloatOr_293644597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(293644597L))
            info.setReturnValue(8.43414E7F);
    }

    @Inject(at = @At("HEAD"), method = "getIntOr(II)I", cancellable = true)
    private void getIntOr_1205067848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1205067848L))
            info.setReturnValue(457085454);
    }

    @Inject(at = @At("HEAD"), method = "addTag(ILnet/minecraft/nbt/Tag;)Z", cancellable = true)
    private void addTag__1781137149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1781137149L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "addAndUnwrap(Lnet/minecraft/nbt/Tag;)V", cancellable = true)
    private void addAndUnwrap_759059242(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(759059242L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "compoundStream()Ljava/util/stream/Stream;", cancellable = true)
    private void compoundStream__1680388472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1680388472L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTag(ILnet/minecraft/nbt/Tag;)Z", cancellable = true)
    private void setTag__340852540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-340852540L))
            info.setReturnValue(false);
    }


}
